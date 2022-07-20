package genetic;
import java.util.ArrayList;
class Thought77 extends Thought{
private static ArrayList<Thought77> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 944.8357489097059;
private double fd1 = 779.2283496611846;
private Thought fo0 = null;
private Thought fo1 = null;
Thought77 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought77 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought77 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought77 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought77 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought77 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought77 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought77 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought77 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought77 instance = new Thought77 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought77 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought77 instance = new Thought77 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought77 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought77 instance = new Thought77 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought77 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought77 instance = new Thought77 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought77 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought77 instance = new Thought77 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought77 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought77 instance = new Thought77 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought77 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought77 instance = new Thought77 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought77 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought77 instance = new Thought77 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[0][7] += fd1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fd0 *= -1;
    Output.points[0][8] += fd1;
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    if (ab4) {
        double ld0 = 588.1425022370546;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        Thought lo1 = Thought192.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
          fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
          ld0 = fo1.m3();
}
        ab3 = fd0 < fd1;
        ld0 = fd0 + fd1;
if(fo0 != null){
          ld0 = fo0.m3(ab4, fb0, fb1, ab1);
}
        ab2 = fd0 < fd1;
        ab3 = !ab4;
        ld0 *= -1;
        Output.points[1][0] += fd0;
        fd1 = ld0 + fd0;
        boolean lb2 = false;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
    boolean lb0 = false;
    Thought lo1 = Thought297.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
    ad1 *= -1;
    boolean lb2 = true;
    Thought lo3 = Thought74.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
    boolean lb4 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    ad4 = fd0 + fd1;
        lb2 = !lb4;
if(fo0 != null){
      fo0.m2();
}
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb2);
}
    lb4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, lb2, lb4, fb0);
}
    fb1 = lb0 || lb2;
    double ld5 = 617.924314845331;
        fd0 = fd1 + ld5;
    ad1 = ad2 + ad3;
    lb4 = fb0 || fb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    ab2 = ad3 < ad4;
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    ab2 = ad3 < ad4;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    fb0 = !fb1;
    fd1 = ad1 - ad2;
    lb0 = lb1 || ab1;
    if (ab2) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        boolean lb2 = true;
        for(int i0=0; i0<10; i0++){
            ab2 = ad1 < ad2;
if(fo1 != null){
              fo0 = fo1.m4();
}
if(fo0 != null){
              ab3 = fo0.m2(ab4, fb0, fb1, lb2);
}
            lb0 = ad3 > ad4;
            if (lb1) {
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
                  fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb2, lb0);
}
                ad1 = ad2 + ad3;
                ad4 = fd0 + fd1;
if(fo0 != null){
                  ad1 = fo0.m3(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
                boolean lb3 = true;
}}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fd1 *= -1;
    fd0 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao3 != null){
      ao3.m1(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld0 = 782.9818377836918;
    ld0 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    fb1 = fd1 < ld0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3();
}
    boolean lb0 = false;
    double ld1 = 969.2591270932487;
if(ao4 != null){
      ao3 = ao4.m4(lb0, fb0, fb1, lb0);
}
        fb0 = !fb1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    ad1 *= -1;
    ad2 = ad3 + ad4;
    double ld2 = 543.5184635041761;
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb3);
}
    fb0 = !fb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought44.getInstance(ao1, ao2, ao3, ao4);
    fd1 *= -1;
    fd0 = fd1 - fd0;
    ab1 = fd1 > fd0;
    Output.points[1][1] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Output.points[1][2] -= fd1;
    double ld1 = 328.10280935418785;
    ld1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fd0 *= -1;
    Thought lo2 = Thought183.getInstance();
    Output.points[1][3] -= fd1;
    ld1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    Output.points[1][4] -= ld1;
    Thought lo3 = Thought371.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0, fb1, ab1, ab2, ab3);
    Thought lo4 = Thought273.getInstance(fd1, ld1, fd0, fd1, ab4, fb0, fb1, ab1);
    ab2 = ab3 && ab4;
    fb0 = ld1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    boolean lb5 = true;
    fd1 = ld1 - fd0;
    boolean lb6 = true;
    fd1 = ld1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    boolean lb0 = false;
    ab1 = ab2 || ab3;
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0);
}
    ab4 = fb0 || fb1;
    lb0 = ab1 || ab2;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb1 = false;
        double ld2 = 537.4796909345996;
    boolean lb3 = true;
    ad3 = ad4 - fd0;
if(ao1 != null){
      ao1.m3();
}
    Thought lo4 = Thought75.getInstance(ab2, ab3, ab4, fb0);
    fd1 = ld2 + ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    Output.points[1][5] -= fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, ad1, ad2, ad3, fb1, lb0, lb1, lb3);
}
    double ld5 = 217.31613973780517;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = !fb0;
    fd0 *= -1;
    double ld1 = 553.3850578507191;
    fb1 = lb0 || ab1;
    boolean lb2 = false;
    fd0 *= -1;
    Output.points[1][6] += fd1;
    Thought lo3 = Thought151.getInstance(fo1, fo0, fo1, fo0);
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
    Output.points[1][7] -= fd0;
    lb4 = ab1 || ab2;
        ab3 = ab4 && fb0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    double ld1 = 638.499153237874;
    ad1 *= -1;
if(fo0 != null){
      fo0.m1();
}
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    ad4 = fd0 + fd1;
    lb0 = ld1 < ad1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    double ld2 = 573.5235082624931;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
}
    boolean lb3 = false;
    fb0 = ad4 < fd0;
    fb1 = lb0 || lb3;
    double ld4 = 492.52132888720826;
    Output.points[1][8] -= fd0;
    fd1 = ld1 + ld2;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    boolean lb0 = false;
if(fo0 != null){
      ab1 = fo0.m2();
}
    Thought lo1 = Thought10.getInstance(ab2, ab3, ab4, fb0);
    boolean lb2 = true;
    Thought lo3 = Thought37.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb2);
    ab1 = !ab2;
    ab3 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
    double ld4 = 501.1591536780743;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb5 = true;
if(fo0 != null){
      ab4 = fo0.m2(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld4;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    double ld6 = 491.3868420954796;
if(fo0 != null){
      ld4 = fo0.m3();
}
    fb0 = !fb1;
    ld6 = ad1 - ad2;
if(fo1 != null){
      fo1.m1(lb0, lb2, lb5, ab1);
}
    ab2 = ad3 < ad4;
    Thought lo7 = Thought48.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld4, ld6, ab3, ab4, fb0, fb1);
    ad1 = ad2 + ad3;
    lb0 = lb2 || lb5;
    Thought lo8 = Thought292.getInstance(ad4, fd0, fd1, ld4, ab1, ab2, ab3, ab4);
    double ld9 = 800.3122836810908;
    Thought lo10 = Thought141.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);

Thought.STACK_COUNTER++;
return lb5;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][0] -= fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb1 = !fb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    boolean lb0 = true;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m2();
}
    lb0 = fd1 < fd0;
    fb0 = fb1 || lb0;
    Thought lo1 = Thought38.getInstance(fb0, fb1, lb0, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    double ld2 = 859.3609644249156;

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    double ld0 = 859.2715165701584;
    ld0 *= -1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = true;
    Output.points[2][1] += ad2;
    boolean lb2 = false;
    lb2 = ad3 < ad4;
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, lb1, lb2);
}
    boolean lb3 = false;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, lb3, fb0, fb1, lb1);
}
    ad4 = fd0 + fd1;
if(ao1 != null){
      ao1.m2(ld0, ad1, ad2, ad3, lb2, lb3, fb0, fb1);
}
    ad4 *= -1;
    lb1 = !lb2;
        for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb3, fb0, fb1, lb1);
}
        fd0 = fd1 - ld0;
        lb2 = lb3 && fb0;
        Output.points[2][2] -= ad1;
        for(int i1=0; i1<10; i1++){
}}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd0 *= -1;
    lb0 = ab1 && ab2;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ab3 = ab4 || fb0;
    fb1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought48.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
    fd1 *= -1;
    ab1 = ab2 || ab3;
    Output.points[2][3] -= fd0;
    fd1 *= -1;
    ab4 = fd0 < fd1;
    fb0 = fd0 > fd1;
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb2 = true;
    lb0 = !lb2;
    boolean lb3 = false;
    lb3 = ab1 || ab2;
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    ab3 = fd1 > fd0;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][4] += ad2;
    ab2 = ad3 < ad4;
    ab3 = fd0 < fd1;
    boolean lb0 = true;
    ad1 *= -1;
    ab3 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb0);
}
    Output.points[2][5] += ad1;
    ab1 = ad2 > ad3;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
}
    fd1 *= -1;
    ad1 *= -1;
    boolean lb1 = false;
    ab2 = ab3 || ab4;
    Output.points[2][6] -= ad2;
    fb0 = fb1 || lb0;
    lb1 = ab1 || ab2;
    double ld2 = 688.1220221577615;
    ab3 = ad2 > ad3;
    ad4 *= -1;
    ab4 = !fb0;
    Thought lo3 = Thought312.getInstance(fo1, ao1, ao2, ao3, fb1, lb0, lb1, ab1);
    fd0 = fd1 + ld2;
    ad1 *= -1;
    ab2 = ab3 && ab4;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
    double ld2 = 810.1555619029347;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
    lb0 = !lb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 && lb0;
    double ld3 = 615.4267651528091;
    Thought lo4 = Thought320.getInstance(fd0, fd1, ld2, ld3, lb1, fb0, fb1, lb0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo1 != null){
      lb0 = fo1.m2(ld2, ld3, fd0, fd1);
}
    Output.points[2][7] -= ld2;
    double ld5 = 528.8580444208444;
    lb1 = fb0 || fb1;
    ld3 = ld5 + fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    Output.points[2][8] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    Thought lo0 = Thought278.getInstance(ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    if (fb0) {
        Thought lo0 = Thought372.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
        Thought lo1 = Thought137.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
        boolean lb2 = true;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
        Thought lo3 = Thought118.getInstance();
        fb1 = !lb2;
        fb0 = ad2 > ad3;
if(fo0 != null){
          fb1 = fo0.m2(lb2, fb0, fb1, lb2);
}
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb2, fb0);
}
        ad3 = ad4 - fd0;
if(fo0 != null){
          fo0.m3(fd1, ad1, ad2, ad3, fb1, lb2, fb0, fb1);
}
        lb2 = fb0 && fb1;
}
Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought30.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
    fb1 = !ab1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought109.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    Output.points[3][0] += ad3;
    fb1 = ab1 && ab2;
    Thought lo2 = Thought322.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
    ab1 = ad2 > ad3;
    ab2 = ad4 > fd0;
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought209.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    ad4 *= -1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo1 = Thought44.getInstance(fd1, fd0, fd1, fd0);
    Output.points[3][1] += fd1;
    if (lb0) {
        Output.points[3][2] -= fd0;
        fd1 = fd0 + fd1;
        double ld2 = 81.86910188265483;
        ld2 *= -1;
        Output.points[3][3] += fd0;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2);
}
        fd0 = fd1 - ld2;
        Thought lo3 = Thought336.getInstance();
        fb0 = fd0 < fd1;
        fb1 = !lb0;
        ld2 *= -1;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    ad1 *= -1;
    fb0 = fb1 && fb0;
    fb1 = ad2 < ad3;
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    double ld0 = 37.179797338876504;
    boolean lb1 = true;
    boolean lb2 = false;
    Output.points[3][4] += ad4;
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1, lb2, fb0, fb1, lb1);
}
    boolean lb3 = false;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, lb2, lb3, fb0, fb1);
}
    ld0 = ad1 - ad2;
    ad3 = ad4 + fd0;
    lb1 = lb2 && lb3;
    fb0 = fb1 || lb1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, lb2, lb3, fb0, fb1);
}
    lb1 = lb2 && lb3;
    double ld4 = 0.055514977843076685;
    fb0 = fd0 < fd1;

Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    Output.points[3][5] -= fd1;
    boolean lb2 = false;
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(lb0, lb1, lb2, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao3.m1();
}
    double ld0 = 306.9327605767093;
    ab4 = fd0 > fd1;
    fb0 = fb1 && ab1;
    ld0 *= -1;
    ad1 *= -1;

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    double ld0 = 816.0709707977106;
    boolean lb1 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
    lb1 = fb0 || fb1;
    double ld2 = 296.8364705029914;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m3(ld2, fd0, fd1, ld0);
}
    lb1 = fb0 && fb1;
    lb1 = fb0 || fb1;
    double ld3 = 460.283566040966;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1);
}
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb0 = fb1 || ab1;
    boolean lb0 = true;
    ab1 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    fb0 = fb1 && lb0;
    double ld2 = 858.3521768396248;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, lb1, ab1, ab2, ab3);
}
    if (ab4) {
        fb0 = fb1 || lb0;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld2, fd0, lb1, ab1, ab2, ab3);
}
        fd1 *= -1;
        ld2 = fd0 - fd1;
        ab4 = ld2 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
        fd1 *= -1;
if(fo1 != null){
          ld2 = fo1.m3(fo0, fo1, fo0, fo1);
}
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
    fb1 = ad2 < ad3;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = !fb0;
    fb1 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = !fb1;
    lb0 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 + fd0;
    fb1 = !lb0;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    lb1 = !lb2;
    ad4 = fd0 - fd1;
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 424.3594115408886;
    if (ab1) {
        ab2 = ld0 < ad1;
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
        Output.points[3][6] -= ad2;
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
        Thought lo2 = Thought326.getInstance(ld0, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
        ab1 = ad4 < fd0;
        fd1 = ld0 - ad1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        ad2 *= -1;
        fb1 = lb1 || ab1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb3 = true;
        } else if (ab3) {
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1);
}
        ab4 = !fb0;
        Thought lo4 = Thought61.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
        Output.points[3][7] += ad4;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo5 = Thought186.getInstance(fb1, ab1, ab2, ab3);
        for(int i0=0; i0<10; i0++){
}}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
        fb0 = fd1 < fd0;
        double ld0 = 638.1939834810507;
    fb1 = !fb0;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb1);
}
    lb2 = !fb0;
if(ao1 != null){
      ao1.m1(ld0, fd0, fd1, ld0, fb1, lb1, lb2, fb0);
}
    double ld3 = 57.39185126305471;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    ad2 = ad3 - ad4;
    Output.points[3][8] -= fd0;
    fb0 = fd1 < ad1;
    ad2 = ad3 + ad4;
    if (fb1) {
        boolean lb0 = false;
        lb0 = fd0 > fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
        if (fb1) {
            lb0 = fb0 && fb1;
            lb0 = !fb0;
            fb1 = lb0 || fb0;
if(ao1 != null){
              fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
              fo1.m1(ad1, ad2, ad3, ad4);
}
            double ld1 = 265.2080180839554;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1);
}
            Thought lo2 = Thought37.getInstance();
if(ao2 != null){
              ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
}}
Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
        double ld0 = 129.46324530356227;
    fd0 *= -1;
    fd1 *= -1;
    boolean lb1 = false;
    ab1 = !ab2;
    double ld2 = 67.24948357858214;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld1 = 665.5133517814297;
    ld1 *= -1;
    ab3 = !ab4;
    boolean lb2 = true;
    Thought lo3 = Thought340.getInstance(ad1, ad2, ad3, ad4);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb4 = true;
    ad2 = ad3 + ad4;
if(ao3 != null){
      ab3 = ao3.m2(ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + ld1;

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    double ld1 = 131.7648759979536;
    ld1 = fd0 + fd1;
    boolean lb2 = true;
    lb0 = lb2 && fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb2, fb0);
}
    fb1 = lb0 && lb2;
    fb0 = ld1 > fd0;
    Thought lo3 = Thought101.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
        Output.points[4][0] += fd1;
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld1 = fd0 + fd1;
    fb1 = lb0 && lb2;
    fb0 = !fb1;
    lb0 = ld1 > fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought26.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    double ld2 = 25.057229009329298;
    Thought lo3 = Thought178.getInstance();
    lb1 = ld2 > fd0;
    fb0 = fb1 || lb1;
    Thought lo4 = Thought171.getInstance(fb0, fb1, lb1, fb0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, fb1, lb1, fb0, fb1);
}
    boolean lb5 = true;
    ld2 *= -1;
    lb1 = lb5 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0, fb1, lb1, lb5, fb0);
}
    double ld6 = 730.7286038714054;
    boolean lb7 = true;
    fd0 = fd1 + ld2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb5);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        double ld0 = 229.04698848831245;
    double ld1 = 834.3005444048428;
if(fo1 != null){
      fo1.m3(ld1, fd0, fd1, ld0);
}
    ld1 = fd0 - fd1;
    Thought lo2 = Thought381.getInstance(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
    fb0 = ld0 < ld1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      ld0 = fo0.m3();
}
    boolean lb3 = false;
    lb3 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb3);
}
    Thought lo4 = Thought330.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, fb0, fb1, lb3, fb0);
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0, fb1, lb3, fb0, fb1);
}
    ld1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
            fb0 = fb1 && lb3;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ld1);
}
    Thought lo5 = Thought97.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, lb3, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1, fb1, lb3, fb0, fb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
