package genetic;
import java.util.ArrayList;
class Thought195 extends Thought{
private static ArrayList<Thought195> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 345.7730991275316;
private double fd1 = 329.8059561099586;
private Thought fo0 = null;
private Thought fo1 = null;
Thought195 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought195 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought195 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought195 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought195 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought195 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought195 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought195 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought195 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought195 instance = new Thought195 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought195 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought195 instance = new Thought195 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought195 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought195 instance = new Thought195 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought195 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought195 instance = new Thought195 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought195 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought195 instance = new Thought195 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought195 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought195 instance = new Thought195 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought195 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought195 instance = new Thought195 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought195 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought195 instance = new Thought195 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    if (fb1) {
        fb0 = fd0 < fd1;
        Thought lo0 = Thought247.getInstance();
        fb1 = !fb0;
        } else {
        fb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        fb1 = fd0 < fd1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fd1 = fd0 - fd1;
        fb0 = fd0 > fd1;
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought67.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[3][3] -= fd0;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought368.getInstance(ab4, fb0, fb1, ab1);
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought359.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
    Thought lo3 = Thought216.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld4 = 7.806230284444139;
    ab4 = !fb0;
    boolean lb5 = false;
    boolean lb6 = false;
    Output.points[3][4] += ld4;
    Thought lo7 = Thought76.getInstance(ab4, fb0, fb1, lb5);
    lb6 = fd0 < fd1;
    ab1 = ab2 && ab3;
    ld4 *= -1;
    ab4 = fb0 && fb1;
    lb5 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4, lb6, ab1, ab2, ab3);
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
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld0 = 128.97903253590505;
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    Output.points[3][5] -= ad3;
    fb1 = !lb1;
    double ld2 = 170.5740847177876;
    Thought lo3 = Thought191.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
    fb0 = ld0 < ld2;
    double ld4 = 30.867294866197938;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld4, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld5 = 999.3998304699771;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    Thought lo6 = Thought251.getInstance(fb1, lb1, fb0, fb1);

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
    ad1 *= -1;
    ab1 = ad2 < ad3;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought201.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 449.0281823013668;
    ab3 = ab4 && fb0;
    fb1 = fd0 < fd1;
        ld1 *= -1;
    ab1 = ab2 || ab3;
    double ld2 = 367.610913420781;
if(fo1 != null){
      ld2 = fo1.m3(ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
}
        ad1 *= -1;
        ab4 = ad2 > ad3;
        ad4 *= -1;
if(fo1 != null){
          fb0 = fo1.m2();
}
        fb1 = ab1 && ab2;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 126.4551070163984;
    ld0 *= -1;
    double ld1 = 765.5685209901828;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought74.getInstance(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought145.getInstance(ao3, ao4, fo0, fo1);
    double ld4 = 642.1829982399516;
    boolean lb5 = true;

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
    lb0 = fb0 || fb1;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
    lb0 = fb0 && fb1;
    lb0 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    Output.points[3][6] -= ad1;
    ad2 = ad3 - ad4;
    fb1 = lb0 && fb0;
    fd0 *= -1;
    boolean lb1 = true;
if(ao2 != null){
      fb0 = ao2.m2();
}
    fb1 = lb0 && lb1;

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
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    if (fb0) {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
        fd1 = fd0 + fd1;
        boolean lb0 = false;
        Thought lo1 = Thought381.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
        Output.points[3][7] -= fd0;
        lb0 = fd1 > fd0;
        ab1 = ab2 || ab3;
        fd1 *= -1;
        double ld2 = 17.415439457984768;
        ab4 = fb0 && fb1;
        boolean lb3 = false;
        boolean lb4 = true;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, lb0, lb3, lb4, ab1);
}
        ld2 = fd0 - fd1;
        ab2 = ab3 || ab4;
        fb0 = fb1 || lb0;
        ld2 = fd0 - fd1;
        Output.points[3][8] += ld2;
        boolean lb5 = true;
        lb3 = lb4 || lb5;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 495.44403047577293;
    ab1 = ad1 < ad2;
    ab2 = ab3 && ab4;
    fb0 = ad3 < ad4;
    fb1 = fd0 < fd1;
    Output.points[4][0] += ld0;
    Thought lo1 = Thought222.getInstance(ad1, ad2, ad3, ad4);
    ab1 = fd0 > fd1;
    ld0 = ad1 - ad2;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ld0 = ao1.m3();
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought149.getInstance(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, fb1, ab1, ab2, ab3);

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
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[4][1] -= fd0;
    fb0 = !fb1;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && fb0;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3();
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought6.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
    fd0 = fd1 + fd0;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3();
}
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    double ld3 = 356.0892539411821;
    Output.points[4][2] += fd0;
    boolean lb4 = true;
    fd1 = ld3 + fd0;
    double ld5 = 458.9683181714;
    fb0 = !fb1;
    lb0 = fd0 < fd1;
    lb2 = lb4 && ab1;
    boolean lb6 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || lb0;
    boolean lb7 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ld5, fd0, fd1, lb2, lb4, lb6, lb7);
}
    Output.points[4][3] -= ld3;
if(fo1 != null){
      fo1.m3(ld5, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Output.points[4][4] += ad1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought353.getInstance();
    fb1 = !fb0;
    Thought lo1 = Thought250.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
    Thought lo2 = Thought262.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    boolean lb3 = false;
    Thought lo4 = Thought340.getInstance(ad3, ad4, fd0, fd1, lb3, fb0, fb1, lb3);
    Thought lo5 = Thought184.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb3, fb0);
    ad1 = ad2 - ad3;
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 - fd1;
        fb1 = ad1 > ad2;
        Thought lo6 = Thought188.getInstance(fo1, fo0, fo1, fo0);
        lb3 = fb0 && fb1;
}
Thought.STACK_COUNTER++;
return lb3;
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
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    ab2 = fd0 < fd1;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[4][5] += fd1;
if(fo1 != null){
      ad1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ab4 = ad1 < ad2;
    ad3 = ad4 - fd0;
    double ld1 = 454.607048117947;
    fb0 = fd0 < fd1;
    fb1 = ld1 > ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld1, ad1, lb0, ab1, ab2, ab3);
}
    if (ab4) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        boolean lb2 = false;
        ab1 = ab2 || ab3;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][6] -= fd0;
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    fd1 *= -1;
    Output.points[4][7] += fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought283.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 *= -1;
    if (lb0) {
        fb0 = fd1 > fd0;
        Thought lo2 = Thought176.getInstance();
if(ao2 != null){
          ao1 = ao2.m4(fb1, lb0, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        boolean lb3 = false;
        Thought lo4 = Thought268.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb3);
        fd1 = fd0 - fd1;
        Thought lo5 = Thought370.getInstance(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb3);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        fd0 *= -1;
        fd1 = fd0 + fd1;
        Thought lo6 = Thought262.getInstance(fd0, fd1, fd0, fd1);
        boolean lb7 = false;
        lb7 = fd0 > fd1;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(lb0, lb1, fb0, fb1);
}
    boolean lb2 = false;
    fd0 = fd1 - ad1;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb0, lb1, lb2, fb0);
}
    fd1 = ad1 - ad2;
    Thought lo3 = Thought341.getInstance(ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb2);
    double ld4 = 324.7981556333882;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld5 = 729.68699001764;
if(fo0 != null){
      ao4 = fo0.m4(ld4, ld5, ad1, ad2);
}
    Output.points[4][8] -= ad3;
    boolean lb6 = true;
    ad4 *= -1;
    boolean lb7 = true;
    lb2 = lb6 || lb7;
    boolean lb8 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld4, ld5);
}
if(fo0 != null){
      ad1 = fo0.m3();
}
    lb8 = fb0 || fb1;
    Thought lo9 = Thought64.getInstance(lb0, lb1, lb2, lb6);
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb7, lb8, fb0, fb1);
}
    lb0 = ld4 < ld5;

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
    ab1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    ab2 = fd1 > fd0;
    ab3 = ab4 && fb0;
        fb1 = ab1 && ab2;
if(ao1 != null){
      ab3 = ao1.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    double ld0 = 610.3401652752116;
    fd0 = fd1 + ld0;
    ab2 = ab3 && ab4;
    double ld1 = 614.2612435405475;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    boolean lb2 = true;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld1, fd0, fd1, ld0);
}
    boolean lb3 = true;
    ab1 = !ab2;
    ab3 = !ab4;
    Thought lo4 = Thought60.getInstance(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld0);
    Thought lo5 = Thought294.getInstance();
    boolean lb6 = true;
if(ao1 != null){
      ab4 = ao1.m2(fb0, fb1, lb2, lb3);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld0, lb6, ab1, ab2, ab3);
}

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
if(ao1 != null){
      ab2 = ao1.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought182.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    double ld1 = 865.7291688240366;
    ld1 = ad1 - ad2;
    boolean lb2 = true;
    double ld3 = 451.9280571148787;
    ab4 = ad2 < ad3;
    Thought lo4 = Thought208.getInstance(ad4, fd0, fd1, ld1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld3, ad1, ad2, ad3);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    Output.points[5][0] += ad4;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb2, ab1, ab2);
}
    fd1 = ld1 - ld3;
    boolean lb5 = false;
    ab2 = ad1 < ad2;
    ad3 *= -1;
    Thought lo6 = Thought54.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
    Thought lo7 = Thought289.getInstance(ld3, ad1, ad2, ad3, lb2, lb5, ab1, ab2);
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb2);
}
    ad4 = fd0 + fd1;
    ld1 = ld3 - ad1;
    boolean lb8 = true;
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
        fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
    double ld0 = 16.808114490355198;
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    boolean lb1 = false;
    ld0 = fd0 - fd1;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(lb1, lb2, fb0, fb1);
}
    lb1 = ld0 > fd0;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought107.getInstance(fd0, fd1, ld0, fd0);

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
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2();
}
    Thought lo0 = Thought46.getInstance(ab3, ab4, fb0, fb1);
    ab1 = fd1 < fd0;
    ab2 = fd1 > fd0;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;

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
    Output.points[5][1] -= ad1;
    fb0 = fb1 || fb0;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought17.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
    Thought lo1 = Thought6.getInstance(fo0, fo1, fo0, fo1);
    ad1 = ad2 - ad3;
    Thought lo2 = Thought95.getInstance(ad4, fd0, fd1, ad1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
if(fo0 != null){
      ad2 = fo0.m3();
}
    fb1 = ad3 > ad4;
    fb0 = fd0 > fd1;
    fb1 = fb0 && fb1;
    Thought lo3 = Thought64.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    boolean lb4 = true;
    ad1 *= -1;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb5 = true;
    Thought lo6 = Thought380.getInstance(fd1, ad1, ad2, ad3);

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
    double ld0 = 544.3542029396299;
    ab2 = ab3 || ab4;
    ld0 = ad1 - ad2;
    fb0 = ad3 < ad4;
    double ld1 = 809.0926596799027;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    ld1 = ad1 - ad2;
    boolean lb2 = false;
    fb0 = fb1 || lb2;
    ad3 = ad4 - fd0;
    fd1 = ld0 + ld1;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb3, ab1, ab2, ab3);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld1, ad1, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, lb3, ab1, ab2, ab3);
}
    boolean lb4 = false;
    Thought lo5 = Thought135.getInstance(fo0, fo1, fo0, fo1);
    ab3 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1);
}
    ab4 = ad1 > ad2;
    Thought lo6 = Thought208.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    Thought lo7 = Thought299.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, lb3);
}
    ld0 *= -1;

Thought.STACK_COUNTER++;
return ld1;
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
    fb0 = fb1 && fb0;
    boolean lb0 = true;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought194.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    Thought lo2 = Thought219.getInstance(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
    boolean lb3 = false;
    boolean lb4 = false;
if(ao4 != null){
      lb3 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      lb4 = ao3.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb0;
    boolean lb5 = true;
    fd0 = fd1 - fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo6 = Thought120.getInstance(lb3, lb4, lb5, fb0);
    fd0 = fd1 + fd0;
    Thought lo7 = Thought110.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, lb3, lb4);
    lb5 = fb0 && fb1;
    boolean lb8 = false;
    Thought lo9 = Thought101.getInstance(fd1, fd0, fd1, fd0, lb0, lb3, lb4, lb5);
    lb8 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb3, lb4, lb5);
}
    lb8 = fb0 || fb1;
    Thought lo10 = Thought224.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    boolean lb11 = false;

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
    ad1 = ad2 + ad3;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    fb1 = ad2 < ad3;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb0 = !fb1;
    fb0 = ad4 < fd0;
    double ld0 = 604.1240911896369;
    boolean lb1 = true;
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, lb1, fb0);
}
    fd1 = ld0 + ad1;
    double ld2 = 406.48829738904556;
    fb1 = !lb1;
    boolean lb3 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb3, fb0, fb1, lb1);
}
    Thought lo4 = Thought223.getInstance(fd0, fd1, ld0, ld2, lb3, fb0, fb1, lb1);
    ad1 = ad2 + ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb3, fb0, fb1, lb1);
}
if(ao3 != null){
      lb3 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ld0, ld2);
}
    ad1 = ad2 - ad3;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
    boolean lb5 = true;
    boolean lb6 = false;
if(ao2 != null){
      lb5 = ao2.m2();
}
    Thought lo7 = Thought75.getInstance(lb6, fb0, fb1, lb1);
    lb3 = !lb5;
    double ld8 = 850.1161225482963;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 51.59549665588853;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
    ab2 = fd1 < ld0;
    boolean lb1 = true;
    ab2 = fd0 < fd1;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
if(ao2 != null){
      ao2.m3();
}
    Output.points[5][2] += fd0;
    ab4 = !fb0;
    Thought lo2 = Thought343.getInstance(fb1, lb1, ab1, ab2);
    ab3 = !ab4;
    fb0 = fb1 || lb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
    Thought lo4 = Thought45.getInstance(ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
    fd0 = fd1 + ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb3, ab1, ab2, ab3);
}
    Output.points[5][3] += fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab2 = ab3 || ab4;
    Thought lo0 = Thought12.getInstance(ad1, ad2, ad3, ad4);
    fb0 = fb1 && ab1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      ao1.m3();
}
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    ab2 = ab3 || ab4;
    Output.points[5][4] += ad3;
    ad4 = fd0 + fd1;
    boolean lb1 = true;
if(ao2 != null){
      ad1 = ao2.m3(ab4, fb0, fb1, lb1);
}
    boolean lb2 = false;
    double ld3 = 276.2431656673467;
    lb2 = ab1 || ab2;
    ab3 = !ab4;
    fb0 = ad1 > ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, lb1, lb2, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(ld3, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought222.getInstance(fo0, fo1, ao1, ao2, fb1, lb1, lb2, ab1);
    Output.points[5][5] += ad4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
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
    double ld0 = 756.088549836392;
    Output.points[5][6] += ld0;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1);
}
    lb1 = fb0 && fb1;
    lb1 = !fb0;
    Output.points[5][7] += ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
    fd1 *= -1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
    ab4 = fb0 && fb1;
    boolean lb2 = true;
    fd1 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, lb1, lb2, ab1, ab2);
}
    ab3 = fd0 < fd1;
    ab4 = fd0 > fd1;
    Output.points[5][8] += fd0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    fd1 *= -1;
    double ld4 = 713.6119219592678;
if(fo0 != null){
      ld4 = fo0.m3(fd0, fd1, ld4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo5 = Thought139.getInstance(lb2, lb3, ab1, ab2);
    ab3 = ab4 && fb0;

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
    fb1 = fb0 || fb1;
        ad2 = ad3 - ad4;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
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
    boolean lb0 = true;
    ad1 = ad2 + ad3;
    lb0 = ab1 && ab2;
    ab3 = ab4 || fb0;
    ad4 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;
    double ld1 = 654.37943079004;
    fb0 = fb1 && lb0;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ld1 = ad1 - ad2;
    ab1 = ab2 && ab3;
    ad3 = ad4 - fd0;
    ab4 = fd1 > ld1;

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
    fd1 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        Thought lo0 = Thought355.getInstance();
    double ld1 = 892.8190148177049;
if(ao2 != null){
      ao2.m3(fb1, fb0, fb1, fb0);
}
    Output.points[6][0] += fd0;
    fd1 = ld1 - fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    Thought lo0 = Thought248.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 > ad1;
    fb0 = fb1 || fb0;
    fb1 = ad2 > ad3;
    ad4 *= -1;
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    ab1 = ab2 && ab3;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ab3 = ao2.m2(fd0, fd1, fd0, fd1);
}
        ab4 = fb0 || fb1;
    lb0 = !ab1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    ab2 = !ab3;
    double ld1 = 713.4531957824104;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo2 = Thought197.getInstance(ab4, fb0, fb1, lb0);
    fd0 = fd1 - ld1;
        if (ab1) {
        ab2 = ab3 || ab4;
        fb0 = fb1 && lb0;
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought185.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ad4 = fd0 - fd1;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
    ad1 = ad2 - ad3;
    ab2 = ad4 > fd0;
    fd1 = ad1 - ad2;
    ab3 = ab4 || fb0;
    ad3 *= -1;
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ad4 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && lb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ad3 = ao2.m3();
}
    ab1 = ab2 || ab3;
    ad4 = fd0 + fd1;
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, lb1, ab1);
}
    ab2 = ab3 || ab4;

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
    fb1 = fb0 && fb1;
    Thought lo0 = Thought9.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought152.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = !lb2;
    boolean lb3 = false;
if(fo0 != null){
      lb3 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb2;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb3 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb2, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb2, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb2, lb3);
}
    fb0 = fd1 < fd0;
    Thought lo4 = Thought42.getInstance(fo0, fo1, fo0, fo1, fb1, lb2, lb3, fb0);
    Output.points[6][1] += fd1;

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
    fb1 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < fd0;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought10.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[6][2] -= fd1;
if(fo1 != null){
          fd0 = fo1.m3();
}
    boolean lb2 = true;
    double ld3 = 599.251420371028;
    boolean lb4 = false;
    Output.points[6][3] += fd0;
    Output.points[6][4] -= fd1;
    ld3 = fd0 + fd1;
    ld3 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb4, fb0, fb1);
}
    lb1 = !lb2;
    boolean lb5 = true;
    double ld6 = 616.8933137620426;
    double ld7 = 188.45590685687776;
    lb4 = !lb5;
    ld3 *= -1;
    double ld8 = 9.157705173919375;
    fb0 = ld6 < ld7;

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
    Thought lo0 = Thought101.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    double ld2 = 629.7241056016977;
    boolean lb3 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld2, fd0, fd1);
}
    ld2 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
    fb0 = !fb1;
if(fo0 != null){
      lb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb1);
}
    lb3 = fd0 < fd1;
    Thought lo4 = Thought124.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb0, fb1, lb1, lb3);
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld2, fd0, fb1, lb1, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ld2, fd0, fd1, ld2);
}
    double ld5 = 515.6522017554612;
    Output.points[6][5] -= ld5;
    fb1 = lb1 && lb3;
    fb0 = fd0 < fd1;

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
