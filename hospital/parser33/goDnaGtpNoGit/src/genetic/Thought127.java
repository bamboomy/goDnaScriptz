package genetic;
import java.util.ArrayList;
class Thought127 extends Thought{
private static ArrayList<Thought127> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 872.2153062357211;
private double fd1 = 826.3299361316436;
private Thought fo0 = null;
private Thought fo1 = null;
Thought127 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought127 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought127 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought127 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought127 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought127 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought127 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought127 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought127 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought127 instance = new Thought127 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought127 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought127 instance = new Thought127 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought127 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought127 instance = new Thought127 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought127 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought127 instance = new Thought127 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought127 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought127 instance = new Thought127 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought127 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought127 instance = new Thought127 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought127 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought127 instance = new Thought127 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought127 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought127 instance = new Thought127 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought162.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb0 = fd1 < fd0;
    Output.points[0][1] += fd1;
    Output.points[0][2] += fd0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;

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
    Output.points[0][3] -= fd0;
    double ld0 = 573.8913598664888;
    Thought lo1 = Thought343.getInstance();
    boolean lb2 = true;
    fd0 *= -1;
    lb2 = !ab1;
    ab2 = ab3 && ab4;
    fb0 = fd1 < ld0;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb2, ab1, ab2);
}
    double ld3 = 733.9766576843774;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3, ab4, fb0, fb1, lb2);
}
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld3, lb4, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
        boolean lb5 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld0, ld3, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld3, fd0);
}
        Thought lo6 = Thought42.getInstance();
if(fo1 != null){
          lb2 = fo1.m2(lb4, ab1, ab2, ab3);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    lb1 = ad3 > ad4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m3(lb1, fb0, fb1, lb0);
}
    boolean lb2 = false;
    boolean lb3 = true;
    double ld4 = 93.08105691191183;
    if (lb1) {
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb2, lb3, fb0, fb1);
}
        lb0 = fd1 > ld4;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb1, lb2, lb3, fb0);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
}
        lb3 = fb0 || fb1;
        boolean lb5 = false;
        for(int i0=0; i0<10; i0++){
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][4] -= ad2;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 - fd0;
        lb0 = fd1 > ad1;
        ad2 = ad3 + ad4;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        double ld1 = 647.2585641173877;
        if (ab2) {
if(fo0 != null){
              fo0.m2();
}
            boolean lb2 = false;
if(fo1 != null){
              ld1 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb2, lb0, ab1);
}
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, ld1, ad1, ab2, ab3, ab4, fb0);
}
            fb1 = lb2 && lb0;
            double ld3 = 401.9248813537266;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
              ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
            ad2 *= -1;
if(fo1 != null){
              fo1.m1(ad3, ad4, fd0, fd1);
}
            fb0 = fb1 && lb2;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    lb0 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 *= -1;
        fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    Output.points[0][5] += fd0;
    fb0 = fb1 || lb0;
    boolean lb1 = false;
    Output.points[0][6] += fd1;
    fd0 = fd1 + fd0;
    Thought lo2 = Thought71.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb0);
}
    boolean lb3 = true;
    lb1 = lb3 || fb0;
    Thought lo4 = Thought160.getInstance(fo0, fo1, ao1, ao2);
    boolean lb5 = false;
    fb0 = fb1 && lb0;
    lb1 = fd1 > fd0;
    lb3 = lb5 || fb0;

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
    fb0 = fb1 && lb0;
    ad2 *= -1;
    double ld1 = 550.4126463831701;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
        double ld2 = 71.8864412624162;
if(ao2 != null){
          ao1 = ao2.m4();
}
        if (fb0) {
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao1 != null){
      fd0 = ao1.m3(lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    boolean lb1 = false;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, ab1, ab2, ab3);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    if (ab4) {
        boolean lb2 = true;
        ab4 = fd1 > fd0;
if(ao3 != null){
          fb0 = ao3.m2();
}
if(ao4 != null){
          ao4.m1(fb1, lb2, lb0, lb1);
}
        for(int i0=0; i0<10; i0++){
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
    Output.points[0][7] += ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    lb0 = ab1 || ab2;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    ab3 = ab4 && fb0;
    fb1 = lb0 && ab1;
    ab2 = ab3 || ab4;
    fd0 = fd1 + ad1;
    Output.points[0][8] += ad2;
    Thought lo1 = Thought86.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
    fb0 = ad1 > ad2;
if(ao1 != null){
      ad3 = ao1.m3();
}
    fb1 = lb0 && ab1;
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought303.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb1, lb0, ab1, ab2);
    ab3 = ab4 || fb0;
    fb1 = ad3 < ad4;
    Thought lo3 = Thought290.getInstance(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
    ad3 = ad4 + fd0;
    fd1 *= -1;

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
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    Output.points[1][0] += fd0;
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    Thought lo0 = Thought15.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m1();
}
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;

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
    ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
    ab1 = !ab2;
    ab3 = fd1 < fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
    double ld1 = 200.80999843033496;
    ab3 = ab4 && fb0;
    fb1 = lb0 && ab1;
    Output.points[1][1] -= ld1;
    ab2 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ab4 = fb0 && fb1;
if(fo0 != null){
          fd1 = fo0.m3(ld1, fd0, fd1, ld1);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    Thought lo0 = Thought241.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    Thought lo1 = Thought327.getInstance();
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 || lb2;
    fb0 = !fb1;
    lb2 = fb0 && fb1;
    boolean lb3 = true;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, lb2, lb3, fb0, fb1);
}
    ad2 *= -1;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb2, lb3, fb0, fb1);
}
    fd1 = ad1 - ad2;
    Output.points[1][2] += ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 + fd1;
    lb2 = lb3 && fb0;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
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
    ad2 = ad3 + ad4;
    ab1 = !ab2;
    Thought lo0 = Thought1.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
    ab3 = ad3 > ad4;
        ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m3();
}
    double ld1 = 470.9943681090868;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
}
    double ld2 = 640.5506616227424;
    ab4 = ld2 < ad1;
    boolean lb3 = true;
    ab4 = fb0 && fb1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, lb3, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb3);
}
    Thought lo4 = Thought385.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld2, ad1, ad2);
}
    ab1 = ab2 && ab3;
    ab4 = ad3 < ad4;
    fb0 = fb1 || lb3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ab1 = fo0.m2();
}

Thought.STACK_COUNTER++;
return ab2;
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
if(ao2 != null){
      fd0 = ao2.m3(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      fb1 = ao3.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    double ld0 = 641.9438626618013;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m2(fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    Thought lo2 = Thought194.getInstance();
    fb1 = lb1 && fb0;
    ld0 = fd0 - fd1;
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb1, lb3);
}
    Thought lo4 = Thought248.getInstance(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb3);
if(ao2 != null){
      ao2.m1(fd0, fd1, ld0, fd0, fb0, fb1, lb1, lb3);
}
    fd1 = ld0 - fd0;
    Output.points[1][3] -= fd1;
    ld0 = fd0 - fd1;
    double ld5 = 259.87561102212965;
    Thought lo6 = Thought77.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb3);
    fb0 = ld0 > ld5;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ld5 *= -1;

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
    double ld0 = 115.78942975516723;
    Output.points[1][4] -= ld0;
    boolean lb1 = false;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ld0 - ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
    lb1 = !lb2;
    fb0 = fd1 < ld0;
    fb1 = ad1 > ad2;
if(ao4 != null){
      ao3 = ao4.m4(lb1, lb2, fb0, fb1);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 *= -1;
        ab4 = !fb0;
    double ld0 = 787.5935222705613;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, fd0);
}
    fb1 = ab1 || ab2;
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought378.getInstance();
    Output.points[1][5] += ld0;
    boolean lb2 = true;
    Thought lo3 = Thought150.getInstance(ab2, ab3, ab4, fb0);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(ao2 != null){
      ab4 = ao2.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
    ad4 = fd0 + fd1;
    ab2 = ad1 > ad2;
    if (ab3) {
        Output.points[1][6] += ad3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
        ad4 = fd0 + fd1;
        ad1 *= -1;
if(ao3 != null){
          ab1 = ao3.m2(ao4, fo0, fo1, ao1);
}
        boolean lb1 = false;
        ab1 = ad2 > ad3;
        boolean lb2 = true;
        ad4 *= -1;
        Output.points[1][7] += fd0;
        double ld3 = 663.9084754617003;
if(ao2 != null){
          fd0 = ao2.m3(fd1, ld3, ad1, ad2);
}
        ad3 = ad4 - fd0;
        ab1 = fd1 < ld3;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought199.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fd1 *= -1;
    fb1 = lb1 || fb0;
    Output.points[1][8] -= fd0;
    fb1 = lb1 || fb0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    boolean lb3 = false;

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
    double ld0 = 631.8009303668919;
    Output.points[2][0] -= fd0;
    ab1 = fd1 > ld0;
    fd0 = fd1 - ld0;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb1 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    double ld1 = 377.3931117450266;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ld1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, ld0, ld1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0);
}
    fd1 = ld0 + ld1;
    fd0 *= -1;
    fd1 = ld0 + ld1;
    Thought lo3 = Thought229.getInstance();
    ab3 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, lb2);
}

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 501.5436511065741;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    double ld1 = 213.23602313619352;
    Thought lo2 = Thought160.getInstance(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo3 = Thought189.getInstance(fo0, fo1, fo0, fo1);
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
        Output.points[2][1] += ad2;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
        ld0 = ld1 - ad1;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        fd1 = ld0 - ld1;
        fb0 = fb1 && fb0;
if(fo1 != null){
          ad1 = fo1.m3();
}
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        double ld4 = 737.4782458149795;
        fb1 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(ld4, ld0, ld1, ad1, fb0, fb1, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return ad3;
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
    ab1 = ab2 && ab3;
    double ld0 = 801.9061752953294;
    double ld1 = 756.3838263813855;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    double ld2 = 851.7461673138837;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ld2);
}
    ad1 *= -1;
    fb1 = ad2 < ad3;
    boolean lb3 = true;
    ad4 = fd0 + fd1;
if(fo0 != null){
      lb3 = fo0.m2();
}
    ld0 = ld1 - ld2;
    Thought lo4 = Thought330.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb3, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, ld1, ab3, ab4, fb0, fb1);
}
    lb3 = ld2 < ad1;
    ab1 = ad2 > ad3;
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    double ld5 = 79.50408588428064;

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
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    boolean lb0 = true;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, lb1);
}
    fd1 *= -1;
    fb0 = !fb1;
    lb0 = lb1 && fb0;
    double ld2 = 452.7414267752664;
if(fo0 != null){
      ld2 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld2, fd0, fd1, fb1, lb0, lb1, fb0);
}
    Thought lo3 = Thought363.getInstance(fo1, ao1, ao2, ao3, fb1, lb0, lb1, fb0);
    boolean lb4 = false;
    fb0 = ld2 > fd0;
    boolean lb5 = true;
    fd1 = ld2 + fd0;
    fb0 = fd1 < ld2;
    fd0 = fd1 - ld2;
    fb1 = lb0 && lb1;
    boolean lb6 = true;

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
    ad1 = ad2 + ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1);
}
    double ld0 = 816.10715969516;
    Thought lo1 = Thought359.getInstance(ad4, fd0, fd1, ld0);
    Thought lo2 = Thought50.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fd0 = fo0.m3();
}
    boolean lb3 = true;
if(fo1 != null){
      fd1 = fo1.m3(lb3, fb0, fb1, lb3);
}
    boolean lb4 = false;
    if (lb4) {
        Thought lo5 = Thought194.getInstance(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3, fb0, fb1, lb3, lb4);
        boolean lb6 = true;
        lb4 = fb0 && fb1;
        lb6 = ad4 > fd0;
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
    fd0 = fd1 - fd0;
    ab2 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    Output.points[2][2] -= fd1;
    ab1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
    Thought lo0 = Thought131.getInstance(ad2, ad3, ad4, fd0);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Output.points[2][3] -= fd0;
if(ao1 != null){
      ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    ad2 *= -1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m1(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ab1 = ao4.m2();
}
    ab2 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    ad2 = ad3 + ad4;
if(ao1 != null){
          ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
        Output.points[2][4] -= ad3;
    fb1 = ab1 || ab2;
    ab3 = !ab4;
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    ab3 = ad2 > ad3;
    double ld1 = 575.4352450850216;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}

Thought.STACK_COUNTER++;
return ad3;
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld0 = 423.9696534326184;
    Thought lo1 = Thought70.getInstance(ld0, fd0, fd1, ld0);
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb0 = fd1 < ld0;
if(fo0 != null){
      fo0.m2();
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    Thought lo3 = Thought226.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb2, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, fb1, lb2, fb0, fb1);
}
    ld0 = fd0 + fd1;
    double ld4 = 716.0602247146293;
    boolean lb5 = false;
    Output.points[2][5] -= ld0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb2, lb5, fb0, fb1);
}
    lb2 = lb5 || fb0;
    fb1 = lb2 && lb5;
    fb0 = ld4 < fd0;
    fb1 = lb2 && lb5;
    fd1 *= -1;
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo6 = Thought103.getInstance(ld0, ld4, fd0, fd1);
    lb5 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb2 = ld0 < ld4;

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
    boolean lb0 = true;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, ab1, ab2);
}
    ab3 = fd0 > fd1;
    fd0 *= -1;
        fd1 = fd0 + fd1;
    Thought lo1 = Thought190.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    Output.points[2][6] -= fd0;
    fd1 *= -1;
    ab2 = ab3 && ab4;
    Thought lo2 = Thought8.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = lb0 || ab1;
    Thought lo3 = Thought86.getInstance();

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
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fd1 = ad1 + ad2;
        fb0 = fb1 && lb0;
    fb0 = ad3 < ad4;
    fb1 = fd0 > fd1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
    lb0 = fd0 < fd1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
    lb0 = lb1 || fb0;
    boolean lb2 = false;
        Output.points[2][7] -= fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought203.getInstance(fd0, fd1, ad1, ad2);
    lb2 = fb0 || fb1;

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
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought21.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
        ab1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        ad1 = ad2 + ad3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
        double ld1 = 485.8781601634956;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
        fd0 *= -1;
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        boolean lb2 = false;
        Thought lo3 = Thought220.getInstance(fo1, fo0, fo1, fo0);
        lb2 = ab1 && ab2;
        fd1 = ld1 + ad1;
        if (ab3) {
            ab4 = ad2 > ad3;
            fb0 = fb1 && lb2;
            ab1 = ad4 < fd0;
}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[2][8] -= fd0;
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
if(ao1 != null){
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    lb1 = !fb0;
    fb1 = lb0 && lb1;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        fb0 = !fb1;
        fd0 = fd1 - fd0;
        lb0 = fd1 < fd0;
        if (lb1) {
            fb0 = !fb1;
            fd1 = fd0 - fd1;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
            boolean lb2 = false;
if(fo0 != null){
              ao4 = fo0.m4(fd0, fd1, fd0, fd1, lb2, lb0, lb1, fb0);
}
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb2, lb0, lb1);
}
}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
    ad3 = ad4 + fd0;
    fb0 = !fb1;
    fb0 = fd1 < ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought161.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    lb0 = fd0 > fd1;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    double ld2 = 622.6837124822213;
    if (fb1) {
        Thought lo3 = Thought303.getInstance(ao2, ao3, ao4, fo0);
        ld2 *= -1;
        lb0 = fd0 < fd1;
        ld2 = fd0 + fd1;
        lb1 = ab1 && ab2;
if(ao1 != null){
          fo1 = ao1.m4(ld2, fd0, fd1, ld2);
}
        Thought lo4 = Thought28.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0);
        fd1 *= -1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    Output.points[3][0] -= ad4;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        lb0 = ab1 || ab2;
if(ao2 != null){
          ao1 = ao2.m4();
}
        Output.points[3][1] -= fd0;
if(ao3 != null){
          ao3.m3(ab3, ab4, fb0, fb1);
}
        double ld1 = 708.5325278472967;
        lb0 = fd0 > fd1;
        }
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
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
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[3][2] += fd1;
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
    double ld0 = 252.1926098705113;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    Output.points[3][3] += fd0;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
        fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    double ld1 = 581.6975708344249;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    Thought lo2 = Thought43.getInstance();
    double ld3 = 0.0994665388162489;
    boolean lb4 = true;
    lb0 = ld3 > fd0;
    Output.points[3][4] += fd1;
    ld1 = ld3 - fd0;

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
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
    fd1 *= -1;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    double ld0 = 983.6474949391231;
    Output.points[3][5] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 || lb1;
    Output.points[3][6] += fd0;

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
