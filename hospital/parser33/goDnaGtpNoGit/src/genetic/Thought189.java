package genetic;
import java.util.ArrayList;
class Thought189 extends Thought{
private static ArrayList<Thought189> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 287.9239403936854;
private double fd1 = 98.27465896995972;
private Thought fo0 = null;
private Thought fo1 = null;
Thought189 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought189 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought189 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought189 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought189 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought189 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought189 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought189 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought189 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought189 instance = new Thought189 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought189 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought189 instance = new Thought189 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought189 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought189 instance = new Thought189 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought189 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought189 instance = new Thought189 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought189 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought189 instance = new Thought189 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought189 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought189 instance = new Thought189 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought189 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought189 instance = new Thought189 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought189 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought189 instance = new Thought189 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 < fd1;
    double ld1 = 103.05281608954569;
    Thought lo2 = Thought89.getInstance(ld1, fd0, fd1, ld1);
        fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    lb0 = !fb0;
    fb1 = lb0 && fb0;
if(fo1 != null){
          fd0 = fo1.m3();
}
    Output.points[8][5] += fd1;
    fb1 = lb0 && fb0;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb3);
}
    fb0 = fd1 < ld1;
    fb1 = lb0 && lb3;

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
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    boolean lb0 = false;
    lb0 = !ab1;
    double ld1 = 729.181707121395;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    lb0 = ab1 && ab2;
    Thought lo2 = Thought131.getInstance(fd0, fd1, ld1, fd0);
    Output.points[8][6] -= fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
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
    Output.points[8][7] -= ad2;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fb1 = ad3 < ad4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    ad2 *= -1;
    double ld1 = 629.8348055754213;
    Output.points[8][8] += ad2;
    fb0 = ad3 > ad4;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ld1;
        ad1 = ad2 + ad3;
        fb1 = lb0 || fb0;
        boolean lb2 = true;
        ad4 *= -1;
if(fo0 != null){
          fo0.m1(fb0, fb1, lb2, lb0);
}
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
    ab1 = ab2 && ab3;
    ab4 = ad2 < ad3;
    Thought lo0 = Thought86.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
if(fo1 != null){
      ab3 = fo1.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 + ad3;
    ab4 = ad4 > fd0;
    Output.points[0][0] += fd1;
    fb0 = ad1 > ad2;
    fb1 = ab1 && ab2;
    ad3 *= -1;
    Thought lo1 = Thought360.getInstance(ad4, fd0, fd1, ad1);
    ab3 = !ab4;
        ad2 *= -1;
    Output.points[0][1] += ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    fb0 = fb1 || ab1;
    Thought lo2 = Thought214.getInstance();
    ab2 = ab3 && ab4;

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
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
        if (fb0) {
            Thought lo1 = Thought28.getInstance(fb1, lb0, fb0, fb1);
if(ao1 != null){
              lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
            boolean lb2 = true;
if(fo1 != null){
              fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb2, lb0);
}
if(ao1 != null){
              fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb2, lb0);
}
if(fo1 != null){
              fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
            Output.points[0][2] += fd1;
if(fo0 != null){
              fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
            double ld3 = 772.8918543182542;
}}
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
    double ld0 = 152.9383469449984;
if(ao2 != null){
      ld0 = ao2.m3();
}
    fb0 = ad1 > ad2;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    double ld1 = 807.5128269531888;
    Thought lo2 = Thought11.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    if (fb1) {
        fb0 = fd1 > ld0;
        fb1 = !fb0;
        ld1 = ad1 - ad2;
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
        Thought lo3 = Thought198.getInstance(fo0, fo1, ao1, ao2);
        fb1 = ld0 > ld1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought204.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
    ab1 = !ab2;
    ab3 = !ab4;
    fb0 = fb1 || ab1;
    fd1 *= -1;
    Thought lo1 = Thought248.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    Output.points[0][3] += fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[0][4] -= fd0;
    Output.points[0][5] += fd1;
    if (ab2) {
        fd0 = fd1 - fd0;
if(ao1 != null){
          ab3 = ao1.m2(ab4, fb0, fb1, ab1);
}
        ab2 = !ab3;
        } else {
        boolean lb2 = true;
        ab3 = fd1 < fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb2);
}
        ab1 = fd1 > fd0;
        Thought lo3 = Thought67.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb2, ab1, ab2);
}
        Output.points[0][6] -= fd1;
        ab3 = fd0 > fd1;
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
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab2 = ao1.m2(ad1, ad2, ad3, ad4);
}
    ab3 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought35.getInstance();
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    ab4 = !fb0;

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
    boolean lb0 = false;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
    lb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    Output.points[0][7] += fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
    fd0 = fd1 + fd0;
    lb0 = lb1 || lb2;
    double ld3 = 818.2882899488882;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = ld3 > fd0;
    lb2 = fd1 > ld3;

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
    fd1 = fd0 + fd1;
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;
    double ld0 = 312.1009092018553;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    for(int i0=0; i0<10; i0++){
        Output.points[0][8] -= fd1;
        ab2 = !ab3;
        Thought lo2 = Thought222.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fd0 = fo0.m3(ab4, fb0, fb1, lb1);
}
        ab1 = ab2 && ab3;
        fd1 *= -1;
        ab4 = fb0 && fb1;
        Thought lo3 = Thought298.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
if(fo1 != null){
          fo1.m1(fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
        boolean lb4 = false;
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    ad4 = fd0 + fd1;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = !fb0;
    fb1 = ad1 < ad2;
    boolean lb1 = false;
    lb0 = ad3 < ad4;
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, ad1, ad2);
}
    fb0 = ad3 < ad4;
    fd0 = fd1 + ad1;
    fb1 = ad2 < ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fb0, fb1, ab1, ab2);
}
    Output.points[1][0] -= ad2;
    double ld0 = 26.293399795324667;
    Thought lo1 = Thought169.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
            ab1 = ab2 && ab3;
    fd1 *= -1;
    ab4 = ld0 < ad1;
    Thought lo2 = Thought21.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb3 = false;
    lb3 = fd1 > ld0;
    boolean lb4 = false;
    double ld5 = 876.5449582739415;
if(fo0 != null){
      ld5 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo6 = Thought290.getInstance(ad1, ad2, ad3, ad4);
    lb4 = !ab1;
    fd0 *= -1;
    fd1 = ld0 + ld5;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb7 = false;
if(fo0 != null){
      fo0.m1();
}
        Output.points[1][1] -= fd1;
    double ld8 = 244.6333429530572;
    double ld9 = 775.1944833623432;

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
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        lb1 = fb0 && fb1;
        lb0 = fd0 < fd1;
        Output.points[1][2] += fd0;
if(ao3 != null){
          lb1 = ao3.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
        fb0 = fb1 || lb0;
        lb1 = fd1 < fd0;
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, lb0, lb1, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        Thought lo2 = Thought241.getInstance(fd1, fd0, fd1, fd0);
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        Thought lo3 = Thought347.getInstance();
        fb1 = lb0 && lb1;
        fd1 *= -1;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(fb1, fb0, fb1, fb0);
}
    Output.points[1][3] += ad1;
    Output.points[1][4] += ad2;
if(ao2 != null){
          ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(ad3, ad4, fd0, fd1);
}
    lb0 = fb0 && fb1;
    lb0 = !fb0;

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
    double ld0 = 570.014354021359;
    ab1 = ld0 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ld0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    Thought lo1 = Thought101.getInstance(fd0, fd1, ld0, fd0);
    Thought lo2 = Thought104.getInstance(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
    Output.points[1][5] += ld0;
    fb1 = ab1 && ab2;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Output.points[1][6] -= fd0;
    ab3 = ab4 || fb0;
    fd1 *= -1;
    if (fb1) {
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 366.09717803711953;
    ab2 = ab3 && ab4;
    fb0 = ld0 > ad1;
    fb1 = ab1 || ab2;
if(ao1 != null){
      ao1.m3(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2);
}
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
    Output.points[1][7] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    boolean lb2 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
    lb0 = lb1 || lb2;
    Thought lo3 = Thought322.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    Thought lo4 = Thought282.getInstance(fd0, fd1, fd0, fd1);

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    Thought lo0 = Thought201.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[1][8] -= fd1;
    ab4 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Thought lo2 = Thought123.getInstance();
    boolean lb3 = true;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Output.points[2][0] -= fd1;
    Output.points[2][1] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = ad1 < ad2;
    ad3 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought377.getInstance(ad4, fd0, fd1, ad1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      lb0 = fo1.m2();
}
    double ld2 = 885.059042246551;
    fd0 = fd1 + ld2;
    fb0 = !fb1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
    fd1 = ld2 + ad1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ad1 + ad2;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
    double ld1 = 239.77643035137154;
    Thought lo2 = Thought307.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    fb1 = ld1 > ad1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ad1);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
    ab1 = ad2 < ad3;
    ab2 = !ab3;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = fd1 > fd0;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m3(lb1, fb0, fb1, lb0);
}
    double ld2 = 273.8245777199432;
    ld2 = fd0 + fd1;
    lb1 = !fb0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2, fb1, lb0, lb1, fb0);
}
    fb1 = fd0 < fd1;
    ld2 *= -1;
    lb0 = fd0 > fd1;
    double ld3 = 55.01643954615213;
if(ao3 != null){
      lb1 = ao3.m2(ld2, ld3, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fb0 = ld2 > ld3;
    boolean lb4 = true;
    fd0 = fd1 - ld2;
    fb0 = fb1 && lb0;
    boolean lb5 = true;
    Thought lo6 = Thought188.getInstance(ao4, fo0, fo1, ao1, lb1, lb4, lb5, fb0);

Thought.STACK_COUNTER++;
return ld3;
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
    Output.points[2][2] -= ad1;
    fb1 = !fb0;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought65.getInstance(ad2, ad3, ad4, fd0);
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fd1 *= -1;
    Thought lo1 = Thought152.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    Thought lo2 = Thought11.getInstance();
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought237.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    boolean lb4 = true;
    lb4 = fb0 || fb1;
    lb4 = !fb0;
    Output.points[2][3] -= ad4;
    fd0 = fd1 - ad1;
    ad2 *= -1;
    if (fb1) {
        lb4 = ad3 < ad4;
        fd0 *= -1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][4] -= fd0;
    Thought lo0 = Thought104.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    fd1 = fd0 + fd1;
    Thought lo1 = Thought182.getInstance(fo0, fo1, ao1, ao2);
    double ld2 = 610.3531379989005;
    fb1 = ab1 || ab2;
    Thought lo3 = Thought190.getInstance(ld2, fd0, fd1, ld2);
    ab3 = ab4 && fb0;
    fd0 *= -1;
    boolean lb4 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    ld2 *= -1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      ld2 = fo0.m3(fb1, lb4, ab1, ab2);
}
    double ld5 = 986.1593622558685;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld5, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return ld5;
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
      ao2.m1(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    Thought lo1 = Thought382.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[2][5] -= fd0;
        ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
    ab4 = !fb0;
    Output.points[2][6] -= ad4;
    fd0 = fd1 + ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
    fb1 = lb0 || ab1;
    ab2 = !ab3;
if(ao4 != null){
      ad1 = ao4.m3(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    fd1 = ad1 - ad2;
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, ab1);
}
    ab2 = ad2 > ad3;
    ab3 = !ab4;
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    fb0 = ad1 > ad2;
    Output.points[2][7] += ad3;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    Thought lo0 = Thought28.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3();
}
    Output.points[2][8] += fd1;
if(fo1 != null){
      fb1 = fo1.m2(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
    ab4 = fb0 || fb1;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    lb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    ab1 = !ab2;
    fd1 = fd0 - fd1;
    double ld2 = 896.3247198631827;
    ab3 = ld2 < fd0;
    Output.points[3][0] += fd1;
    ab4 = fb0 && fb1;
    lb0 = ld2 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb3 = true;
    ld2 = fd0 - fd1;

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
    double ld0 = 233.4053295861975;
    double ld1 = 413.5603313192562;
    Thought lo2 = Thought125.getInstance(fb0, fb1, fb0, fb1);
    boolean lb3 = false;
    boolean lb4 = false;
    lb3 = ad1 < ad2;
    lb4 = fb0 || fb1;
    Output.points[3][1] -= ad3;
    boolean lb5 = true;
    ad4 = fd0 + fd1;
    boolean lb6 = true;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, lb3, lb4, lb5, lb6);
}
    boolean lb7 = false;
    Output.points[3][2] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1, lb7, fb0, fb1, lb3);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, lb4, lb5, lb6, lb7);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[3][3] += fd0;
    Thought lo8 = Thought363.getInstance(fd1, ld0, ld1, ad1);

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
    ad2 = ad3 + ad4;
    ab2 = ab3 || ab4;
    fb0 = fd0 < fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = ab1 && ab2;
    Thought lo0 = Thought278.getInstance();
    ab3 = !ab4;
if(fo1 != null){
      fo1.m2(fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < ad1;
    boolean lb1 = true;
    Output.points[3][4] += ad2;
    ab3 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 62.50519005334109;
    double ld1 = 440.5292368680167;
    double ld2 = 724.740876714385;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ld1, ld2, fd0);
}
    double ld3 = 182.017481559245;
if(ao2 != null){
      fd0 = ao2.m3();
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fd1 = ld0 + ld1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ld2, ld3, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m3(ld0, ld1, ld2, ld3, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
        Thought lo4 = Thought112.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      ao3.m1(ld1, ld2, ld3, fd0);
}
    boolean lb5 = false;
    fb0 = fb1 && lb5;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, ld0, ld1, ld2);
}
    ld3 = fd0 - fd1;
    ld0 *= -1;
if(ao3 != null){
      ld1 = ao3.m3();
}
    boolean lb6 = false;
if(ao4 != null){
      ao4.m3(lb6, fb0, fb1, lb5);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ld2, ld3, fd0, fd1, lb6, fb0, fb1, lb5);
}
        Thought lo7 = Thought396.getInstance(ld0, ld1, ld2, ld3, lb6, fb0, fb1, lb5);
    lb6 = fb0 && fb1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][5] += ad1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    ad2 = ad3 - ad4;
    double ld0 = 413.4710003428267;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    ld0 = ad1 + ad2;
    ad3 *= -1;
    double ld1 = 67.4973812234544;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ld0, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
}

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought178.getInstance(fd0, fd1, fd0, fd1);
    boolean lb2 = false;
    Thought lo3 = Thought242.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    ab4 = !fb0;
    boolean lb4 = false;
if(fo0 != null){
      fb0 = fo0.m2();
}
    Thought lo5 = Thought78.getInstance(fb1, lb0, lb2, lb4);
    fd0 = fd1 + fd0;
    ab1 = ab2 && ab3;
    Thought lo6 = Thought150.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, lb2, lb4, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    lb0 = lb2 && lb4;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought59.getInstance();
    ab3 = ad4 < fd0;
    double ld1 = 547.1089008645528;
if(ao1 != null){
      fd0 = ao1.m3(ab4, fb0, fb1, ab1);
}
    fd1 = ld1 + ad1;
    ad2 = ad3 - ad4;
    ab2 = fd0 < fd1;
    boolean lb2 = false;
    Thought lo3 = Thought52.getInstance(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
    Output.points[3][6] -= ad4;
if(fo1 != null){
          fo1.m3(fd0, fd1, ld1, ad1, fb1, lb2, ab1, ab2);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld1;

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
    boolean lb0 = true;
    boolean lb1 = false;
    double ld2 = 564.5110720523995;
    lb1 = fd0 > fd1;
    fb0 = !fb1;
        ld2 *= -1;
    lb0 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(ld2, fd0, fd1, ld2);
}
    lb0 = lb1 && fb0;
    fb1 = !lb0;
    Thought lo3 = Thought346.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
    fd1 = ld2 + fd0;
    double ld4 = 978.6816964217655;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[3][7] -= fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld2, lb1, fb0, fb1, lb0);
}
    Output.points[3][8] -= ld4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, ld4, lb1, fb0, fb1, lb0);
}
    fd0 = fd1 - ld2;
    Thought lo5 = Thought268.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld4 = fd0 - fd1;
    Thought lo6 = Thought379.getInstance(ld2, ld4, fd0, fd1);

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
    fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    Output.points[4][0] -= fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 465.3917438957127;
    fb0 = fb1 && fb0;

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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fd1 *= -1;
    fd0 *= -1;
    lb0 = fb0 || fb1;
    fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb0 = fb0 || fb1;
        fd0 = fd1 - fd0;
    lb0 = fb0 && fb1;
        Thought lo1 = Thought235.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
if(fo1 != null){
      lb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought337.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    Thought lo3 = Thought106.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
    fd0 *= -1;

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
