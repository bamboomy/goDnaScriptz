package genetic;
import java.util.ArrayList;
class Thought73 extends Thought{
private static ArrayList<Thought73> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 894.459946734131;
private double fd1 = 667.09014661064;
private Thought fo0 = null;
private Thought fo1 = null;
Thought73 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought73 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought73 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought73 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought73 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought73 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought73 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought73 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought73 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought73 instance = new Thought73 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought73 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought73 instance = new Thought73 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought73 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought73 instance = new Thought73 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought73 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought73 instance = new Thought73 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought73 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought73 instance = new Thought73 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought73 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought73 instance = new Thought73 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought73 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought73 instance = new Thought73 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought73 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought73 instance = new Thought73 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought389.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 *= -1;
    Output.points[4][3] += fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    if (fb0) {
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 < fd1;
    fd0 = fd1 - fd0;
    ab3 = !ab4;
    fb0 = fb1 && ab1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    ab2 = fd1 > fd0;
    ab3 = ab4 || fb0;
    fb1 = !ab1;
    Output.points[4][4] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = false;
    if (ab1) {
        fd1 *= -1;
        } else {
        ab2 = ab3 || ab4;
        fb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        Output.points[4][5] += fd0;
        lb0 = ab1 || ab2;
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
    fb1 = ad2 > ad3;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = ad2 > ad3;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1);
}
    fb1 = ad2 > ad3;
    ad4 *= -1;
    boolean lb1 = true;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m1();
}
    double ld2 = 785.2206412319629;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    boolean lb0 = false;
    ad2 = ad3 - ad4;
    boolean lb1 = true;
    fd0 = fd1 - ad1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, lb1, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    double ld3 = 172.2182348970401;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb0, lb1, lb2, ab1);
}
    ld3 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld4 = 46.889730046895906;
    double ld5 = 704.0312008555251;
if(fo1 != null){
      fo0 = fo1.m4(ld4, ld5, ad1, ad2);
}
    ab3 = ad3 > ad4;
    boolean lb6 = true;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ld4);
}
    ld5 = ad1 + ad2;

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
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      fd0 = ao3.m3(fb1, fb0, fb1, fb0);
}
    double ld0 = 126.89390757661094;
    double ld1 = 500.4113791048527;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    ld1 = fd0 - fd1;
    Thought lo2 = Thought322.getInstance(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = ld1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, ld1, fd0);
}
    fb0 = fb1 || fb0;
    double ld3 = 536.6335066540059;
    boolean lb4 = false;
    fb0 = fd0 > fd1;
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, ld1, ld3, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    ld0 *= -1;

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
    boolean lb0 = false;
    ad2 *= -1;
if(ao1 != null){
      ad3 = ao1.m3(lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    double ld1 = 105.68542507743308;
    fb1 = lb0 && fb0;
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    boolean lb2 = false;
    fd0 = fd1 + ld1;
    fb0 = ad1 < ad2;
    fb1 = lb0 || lb2;
    fb0 = fb1 && lb0;
    lb2 = ad3 < ad4;
    fd0 *= -1;
    Output.points[4][6] += fd1;

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
    ab1 = fd0 < fd1;
    fd0 *= -1;
    Thought lo0 = Thought166.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought191.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
    boolean lb3 = true;
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
        fb0 = fd0 > fd1;
if(ao4 != null){
      fb1 = ao4.m2();
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
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    boolean lb1 = false;
    Thought lo2 = Thought242.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    lb0 = lb1 || ab1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || lb1;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
    Output.points[4][7] -= ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    lb1 = !ab1;

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
if(fo1 != null){
      fb1 = fo1.m2();
}
    double ld0 = 150.38460129610164;
    fb0 = !fb1;
    Thought lo1 = Thought307.getInstance(fb0, fb1, fb0, fb1);
    fb0 = ld0 < fd0;
    fd1 *= -1;
    ld0 = fd0 + fd1;
    boolean lb2 = true;
    ld0 *= -1;
    fb0 = fd0 > fd1;
    boolean lb3 = false;
    Thought lo4 = Thought221.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb2, lb3);

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    for(int i0=0; i0<10; i0++){
        if (fb0) {
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
            double ld0 = 149.30573842812427;
            fd0 *= -1;
            Thought lo1 = Thought109.getInstance(fo1, fo0, fo1, fo0);
            if (ab2) {
                boolean lb2 = false;
                ab2 = ab3 && ab4;
                fd1 = ld0 - fd0;
                Thought lo3 = Thought333.getInstance(fd1, ld0, fd0, fd1);
                fb0 = !fb1;
                lb2 = ld0 < fd0;
                fd1 = ld0 + fd0;
                Output.points[4][8] -= fd1;
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
                  fo1 = fo0.m4();
}
                boolean lb4 = false;
                lb4 = ab1 || ab2;
                ab3 = ab4 && fb0;
                fb1 = fd0 < fd1;
                ld0 = fd0 - fd1;
if(fo0 != null){
                  fo1 = fo0.m4(lb2, lb4, ab1, ab2);
}
}}}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
    Thought lo0 = Thought36.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[5][0] += ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    fd1 *= -1;
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    fb0 = ad1 > ad2;
    fb1 = !lb1;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo1.m2();
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
        Thought lo2 = Thought176.getInstance(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
        fb0 = fd0 > fd1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        fb0 = ad2 > ad3;
if(fo1 != null){
          fb1 = fo1.m2(ad4, fd0, fd1, ad1);
}
        }
    Output.points[5][1] += ad2;
    ad3 = ad4 + fd0;
    Thought lo0 = Thought314.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    double ld1 = 962.0446479622599;
    if (ab1) {
if(fo0 != null){
          ab2 = fo0.m2();
}
        ad3 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
        ab1 = ad4 > fd0;
        Thought lo2 = Thought191.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
        boolean lb3 = true;
        ab1 = ab2 && ab3;
        ab4 = ld1 < ad1;
        if (fb0) {
            Thought lo4 = Thought206.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
              fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
            double ld5 = 0.046021203126074384;
}}
Thought.STACK_COUNTER++;
return ab1;
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
    fb1 = fb0 && fb1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    fb1 = fd1 < fd0;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = fb0 && fb1;
    double ld0 = 239.9481423446878;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 + ld0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    Output.points[5][2] -= ad3;
    ad4 *= -1;
    Thought lo0 = Thought45.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    ad3 = ad4 + fd0;
    boolean lb1 = false;
    Thought lo2 = Thought133.getInstance(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
    Thought lo3 = Thought284.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb1, fb0);
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    Thought lo4 = Thought187.getInstance(ad4, fd0, fd1, ad1);
    Output.points[5][3] += ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    double ld5 = 944.0013906801565;
    ad1 *= -1;
    fb1 = lb1 && fb0;
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(lb1, fb0, fb1, lb1);
}
    boolean lb6 = true;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, lb6, fb0, fb1, lb1);
}
    double ld7 = 973.0595265798338;
    boolean lb8 = false;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ld5, ld7, lb6, lb8, fb0, fb1);
}

Thought.STACK_COUNTER++;
return lb1;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    Output.points[5][4] -= fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = fd1 > fd0;
    lb0 = ab1 && ab2;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 367.52692775084154;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0);
}
    boolean lb2 = false;
if(ao3 != null){
      fd1 = ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought158.getInstance(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1, fb1, lb0, lb2, ab1);
    ab2 = ab3 && ab4;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld1, fd0, fd1, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb4 = true;

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
    ab2 = ad1 > ad2;
    boolean lb0 = false;
    ad3 = ad4 - fd0;
    Thought lo1 = Thought118.getInstance(fd1, ad1, ad2, ad3);
    Thought lo2 = Thought81.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
        double ld3 = 826.8480708044538;
    Thought lo4 = Thought247.getInstance();
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        fb1 = lb0 || ab1;
        Output.points[5][5] += ad1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld3, ad1, ad2, fb1, lb0, ab1, ab2);
}
        ad3 *= -1;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
        double ld5 = 202.44781143977053;
        if (lb0) {
}}
Thought.STACK_COUNTER++;
return ab1;
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
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    boolean lb0 = false;
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb1 = !lb0;
    fb0 = fd1 < fd0;
    fb1 = !lb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought234.getInstance();
    Output.points[5][6] -= fd1;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        fd0 *= -1;
        boolean lb2 = true;
        lb2 = lb0 && fb0;
if(fo1 != null){
          fo1.m3(fb1, lb2, lb0, fb0);
}
        fb1 = fd1 > fd0;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    Output.points[5][7] -= fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    boolean lb1 = true;
    double ld2 = 787.5335724482911;
    Output.points[5][8] -= ld2;
    boolean lb3 = true;
    fd0 *= -1;
    boolean lb4 = false;
    ab3 = ab4 && fb0;
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ld2 = fd0 - fd1;
    lb3 = ld2 > fd0;
    fd1 *= -1;
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld2, fd0);
}
    Output.points[6][0] -= fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
    fd0 = fd1 + ld2;
if(fo0 != null){
      fo0.m2();
}
    fd0 *= -1;
    lb4 = fd1 < ld2;

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
    fb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    boolean lb1 = false;
    lb1 = ad2 > ad3;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
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
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
    Thought lo1 = Thought360.getInstance(fb0, fb1, lb0, ab1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}

Thought.STACK_COUNTER++;
return ad1;
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
    Output.points[6][1] -= fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    boolean lb2 = true;
    lb0 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
    double ld3 = 134.97400714860152;
    Output.points[6][2] += ld3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb0, lb1, lb2, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    double ld0 = 205.29551539852545;
    double ld1 = 936.5757792397327;
    ld0 *= -1;
    Thought lo2 = Thought199.getInstance();
    fb0 = !fb1;
if(ao3 != null){
      ao3.m1(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
if(ao3 != null){
      ld1 = ao3.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Thought lo3 = Thought25.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought36.getInstance(ao2, ao3, ao4, fo0);
        fb0 = !fb1;
        fd0 = fd1 - ld0;
        for(int i1=0; i1<10; i1++){
            ld1 = ad1 + ad2;
            fb0 = !fb1;
            fb0 = !fb1;
if(fo1 != null){
              fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
            Thought lo5 = Thought95.getInstance(ao1, ao2, ao3, ao4, ld0, ld1, ad1, ad2);
            if (fb1) {
                ad3 *= -1;
}}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    fd1 *= -1;
    ab4 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
    Thought lo0 = Thought389.getInstance(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
    double ld1 = 550.8663778577003;
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    Output.points[6][3] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld1, fd0, fd1);
}
    fb0 = fb1 && ab1;
    Thought lo2 = Thought298.getInstance(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1);
    double ld3 = 599.930690895548;
    Output.points[6][4] -= ld3;
    ab2 = ab3 || ab4;
    double ld4 = 681.7338469623656;

Thought.STACK_COUNTER++;
return ld4;
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
    ab1 = ab2 && ab3;
if(ao1 != null){
      ab4 = ao1.m2();
}
if(ao2 != null){
      ao2.m1(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought63.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb1 = true;
if(ao3 != null){
      ab3 = ao3.m2(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ad2 = ao4.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb1, ab1);
}
    double ld2 = 93.60249982315733;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Output.points[6][5] += ld2;
    ad1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    if (fb1) {
        } else {
}
Thought.STACK_COUNTER++;
return ld2;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    Output.points[6][6] -= fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    Thought lo0 = Thought147.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    Output.points[6][7] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < fd0;
    double ld1 = 817.9555284228198;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
    lb2 = fb0 || fb1;
    fd1 = ld1 + fd0;
    Thought lo3 = Thought363.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);

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
    double ld0 = 701.8745933877548;
if(fo0 != null){
      fo0.m2();
}
    ab1 = ab2 || ab3;
    double ld1 = 674.8699487122254;
    ld0 = ld1 - fd0;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0, ab3, ab4, fb0, fb1);
}
    double ld2 = 110.32569350711647;
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, ld0, ld1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
    Thought lo4 = Thought117.getInstance(ld2, fd0, fd1, ld0);
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1);
}
    Output.points[6][8] -= ld0;
    boolean lb5 = true;
    ld1 = ld2 + fd0;
    ab1 = !ab2;
    ab3 = fd1 > ld0;
if(fo0 != null){
      ld1 = fo0.m3();
}
    double ld6 = 42.37169773524305;
    Output.points[7][0] -= ld2;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb3, lb5, ab1);
}
    boolean lb7 = true;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ld6, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    ld1 = ld2 + ld6;

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
    double ld0 = 705.4684835381222;
if(fo1 != null){
      ld0 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[7][1] += fd0;
    if (fb0) {
        boolean lb1 = true;
        fb0 = fb1 || lb1;
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
}
        lb2 = !fb0;
        fd1 = ld0 - ad1;
        fb1 = !lb1;
        ad2 = ad3 - ad4;
        fd0 = fd1 + ld0;
        double ld3 = 500.63924394181873;
        ld0 = ad1 - ad2;
        lb2 = ad3 < ad4;
        fb0 = fb1 && lb1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    ad1 = ad2 - ad3;
    double ld0 = 745.6594094400598;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = ad4 > fd0;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, ad1, ad2);
}
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
          fo1.m2();
}
        ab1 = ad1 > ad2;
        } else if (ab2) {
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
            for(int i1=0; i1<10; i1++){
}}}
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
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
    double ld0 = 251.30291660348772;
if(ao1 != null){
      ao1.m1(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld1 = 418.0576874495135;
    boolean lb2 = false;
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb2, lb3, fb0, fb1);
}
    fd0 = fd1 - ld0;
    Output.points[7][2] -= ld1;

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
    fb0 = !fb1;
    fb0 = ad1 < ad2;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb0 = true;
    double ld1 = 131.62517941189788;
    double ld2 = 79.7523524853248;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    lb0 = fb0 && fb1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        lb0 = !ab1;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
        double ld1 = 797.012610831368;
        double ld2 = 999.5109201190932;
        Output.points[7][3] -= ld1;
        ab2 = ld2 < fd0;
        Thought lo3 = Thought348.getInstance();
        Thought lo4 = Thought353.getInstance(ab3, ab4, fb0, fb1);
        if (lb0) {
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld1, ld2, fd0, ab1, ab2, ab3, ab4);
}
            fd1 *= -1;
            ld1 = ld2 - fd0;
            fb0 = !fb1;
            lb0 = ab1 && ab2;
            ab3 = ab4 || fb0;
            fb1 = !lb0;
            fd1 = ld1 - ld2;
            Output.points[7][4] -= fd0;
            ab1 = fd1 > ld1;
            ld2 *= -1;
if(fo1 != null){
              fd0 = fo1.m3(fd1, ld1, ld2, fd0, ab2, ab3, ab4, fb0);
}
            Thought lo5 = Thought168.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, ab1, ab2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
        ab3 = !ab4;
        fb0 = ad2 > ad3;
        ad4 = fd0 - fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        Thought lo0 = Thought156.getInstance(ad1, ad2, ad3, ad4);
        boolean lb1 = true;
        double ld2 = 815.8115800138931;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld2);
}
        fb1 = ad1 < ad2;
if(ao2 != null){
          ao1 = ao2.m4();
}
        lb1 = ad3 > ad4;
if(ao4 != null){
          ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
        boolean lb3 = false;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld2, ad1, ad2, ab4, fb0, fb1, lb1);
}
if(ao4 != null){
          ad3 = ao4.m3(ad4, fd0, fd1, ld2, lb3, ab1, ab2, ab3);
}
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        lb1 = ad1 > ad2;
        double ld5 = 70.49844296519412;
        double ld6 = 953.1204390825056;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        lb3 = lb4 || ab1;
}
Thought.STACK_COUNTER++;
return ao1;
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
    fd1 *= -1;
    boolean lb0 = false;
    fd0 *= -1;
    double ld1 = 207.6626735805907;
    double ld2 = 999.5379207471957;
    double ld3 = 965.6518034338425;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1);
}
    ld1 = ld2 - ld3;
    lb0 = fd0 < fd1;

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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[7][5] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        boolean lb1 = false;
    lb0 = lb1 && fb0;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    double ld2 = 708.5354925070275;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
    boolean lb3 = true;
    boolean lb4 = false;
    lb1 = fd0 > fd1;

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
    Thought lo0 = Thought188.getInstance();
    fd0 *= -1;
        Output.points[7][6] += fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    fd1 *= -1;
    boolean lb2 = false;
    lb1 = lb2 || fb0;
    fd0 = fd1 - fd0;
    fb1 = !lb1;
if(fo1 != null){
      fd1 = fo1.m3(lb2, fb0, fb1, lb1);
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, lb3, fb0, fb1);
}
    boolean lb4 = true;

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
